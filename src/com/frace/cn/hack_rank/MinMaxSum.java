package com.frace.cn.hack_rank;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MinMaxSum {
	static int ans[] = new int[1000001];

	public static void main(String[] args) throws IOException {
		int prime[] = new int[1000001];
		prime[0] = 1;
		prime[1] = 1;
		for (int i = 2; i * i < 1000001; i++)
			if (prime[i] == 0)
				for (int j = i * i; j < 1000001; j += i)
					prime[j] = 1;
		int a[] = {1,2,3,4,5};
		Arrays.sort(a);
		long sum = (long) a[0] + (long) a[1] + (long) a[2] + (long) a[3];
		long sum1 = sum + (long) a[4] - (long) a[0];
		System.out.println(sum + " " + sum1);

	}

	public static int binarySearchLastOccurrence(int arr[], int low, int high, int data) {
		int mid;

		// A simple implementation of Binary Search
		if (high >= low) {
			mid = low + (high - low) / 2; // To avoid overflow
			if ((mid == high && arr[mid] == data) || (arr[mid] == data && arr[mid + 1] > data))
				return mid;

			// We need to give preference to right part of the array
			// since we are concerned with the last occurrence
			else if (arr[mid] <= data)
				return binarySearchLastOccurrence(arr, mid + 1, high, data);
			else
				// We need to search in the left half
				return binarySearchLastOccurrence(arr, low, mid - 1, data);
		}
		return -1;
	}

	public static long pow(long n, long p, long m) {
		long result = 1;
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		while (p != 0) {
			if (p % 2 == 1)
				result *= n;
			if (result >= m)
				result %= m;
			p >>= 1;
			n *= n;
			if (n >= m)
				n %= m;
		}
		return result;
	}

	public static int BS(int val, int a[]) {
		int low = 0;
		int high = a.length - 1;
		int tt = 0;
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] < val) {
				tt = low;
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return low;
	}

	static class Pair implements Comparable<Pair> {
		int r;
		int v;

		Pair(int mr, int er) {
			r = mr;
			v = er;
		}

		@Override
		public int compareTo(Pair o) {
			if (o.r > this.r)
				return -1;
			else if (o.r < this.r)
				return 1;
			else {
				if (o.v > this.v)
					return -1;
				else
					return 1;
			}

		}
	}

	static class TVF implements Comparable<TVF> {
		int index, size;

		TVF(int i, int c) {
			index = i;
			size = c;
		}

		@Override
		public int compareTo(TVF o) {
			if (o.size > this.size)
				return -1;
			else if (o.size < this.size)
				return 1;
			else
				return 0;
		}
	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class InputReader {

		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar, snumChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
}
