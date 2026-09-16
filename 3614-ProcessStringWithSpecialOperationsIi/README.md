# 3614. Process String with Special Operations II

**Difficulty:** Hard  
[View on LeetCode](https://leetcode.com/problems/process-string-with-special-operations-ii/)

---

You are given a string `s` consisting of lowercase English letters and the special characters: `'*'`, `'#'`, and `'%'`.

You are also given an integer `k`.

Build a new string `result` by processing `s` according to the following rules from left to right:

- If the letter is a **lowercase** English letter append it to `result`.
- A `'*'` **removes** the last character from `result`, if it exists.
- A `'#'` **duplicates** the current `result` and **appends** it to itself.
- A `'%'` **reverses** the current `result`.

Return the `k^th` character of the final string `result`. If `k` is out of the bounds of `result`, return `'.'`.

**Example 1:**

**Input:** s = "a#b%*", k = 1

**Output:** "a"

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;"><code>i</code></th>
			<th style="border: 1px solid black;"><code>s[i]</code></th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current <code>result</code></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;"><code>&#39;a&#39;</code></td>
			<td style="border: 1px solid black;">Append <code>&#39;a&#39;</code></td>
			<td style="border: 1px solid black;"><code>&quot;a&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;"><code>&#39;#&#39;</code></td>
			<td style="border: 1px solid black;">Duplicate <code>result</code></td>
			<td style="border: 1px solid black;"><code>&quot;aa&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>&#39;b&#39;</code></td>
			<td style="border: 1px solid black;">Append <code>&#39;b&#39;</code></td>
			<td style="border: 1px solid black;"><code>&quot;aab&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;"><code>&#39;%&#39;</code></td>
			<td style="border: 1px solid black;">Reverse <code>result</code></td>
			<td style="border: 1px solid black;"><code>&quot;baa&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;"><code>&#39;*&#39;</code></td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;"><code>&quot;ba&quot;</code></td>
		</tr>
	</tbody>
</table>

The final `result` is `"ba"`. The character at index `k = 1` is `'a'`.

**Example 2:**

**Input:** s = "cd%#*#", k = 3

**Output:** "d"

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;"><code>i</code></th>
			<th style="border: 1px solid black;"><code>s[i]</code></th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current <code>result</code></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;"><code>&#39;c&#39;</code></td>
			<td style="border: 1px solid black;">Append <code>&#39;c&#39;</code></td>
			<td style="border: 1px solid black;"><code>&quot;c&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;"><code>&#39;d&#39;</code></td>
			<td style="border: 1px solid black;">Append <code>&#39;d&#39;</code></td>
			<td style="border: 1px solid black;"><code>&quot;cd&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>&#39;%&#39;</code></td>
			<td style="border: 1px solid black;">Reverse <code>result</code></td>
			<td style="border: 1px solid black;"><code>&quot;dc&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;"><code>&#39;#&#39;</code></td>
			<td style="border: 1px solid black;">Duplicate <code>result</code></td>
			<td style="border: 1px solid black;"><code>&quot;dcdc&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;"><code>&#39;*&#39;</code></td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;"><code>&quot;dcd&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">5</td>
			<td style="border: 1px solid black;"><code>&#39;#&#39;</code></td>
			<td style="border: 1px solid black;">Duplicate <code>result</code></td>
			<td style="border: 1px solid black;"><code>&quot;dcddcd&quot;</code></td>
		</tr>
	</tbody>
</table>

The final `result` is `"dcddcd"`. The character at index `k = 3` is `'d'`.

**Example 3:**

**Input:** s = "z*#", k = 0

**Output:** "."

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;"><code>i</code></th>
			<th style="border: 1px solid black;"><code>s[i]</code></th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current <code>result</code></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;"><code>&#39;z&#39;</code></td>
			<td style="border: 1px solid black;">Append <code>&#39;z&#39;</code></td>
			<td style="border: 1px solid black;"><code>&quot;z&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;"><code>&#39;*&#39;</code></td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;"><code>&quot;&quot;</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>&#39;#&#39;</code></td>
			<td style="border: 1px solid black;">Duplicate the string</td>
			<td style="border: 1px solid black;"><code>&quot;&quot;</code></td>
		</tr>
	</tbody>
</table>

The final `result` is `""`. Since index `k = 0` is out of bounds, the output is `'.'`.

**Constraints:**

- `1 <= s.length <= 10^5`
- `s` consists of only lowercase English letters and special characters `'*'`, `'#'`, and `'%'`.
- `0 <= k <= 10^15`
- The length of `result` after processing `s` will not exceed `10^15`.
