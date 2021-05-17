# **Brain-Workouts**
Pump your brain with some fun puzzles!

## Part 1 ##
- **Question**: Read input from the user one line at a time, and output the last x distinct lines in sorted order, where x>=0 is a parameter. If there are fewer than x lines, print the existing distinct lines. For example, input lines “a”, “b”, “b”, “c” and x=3 would output “a”, “b”, “c”, as would the input “a”, “b”, “c”, “b”. As another example, input lines “x”, “e”, “b”, “e”, “c”, “d” with x=3 would output “c”, “d”, “e”. As a last example, input lines “a”, “b”, “c”, “a”, “d” and x=3 would output “a”, “c”, “d”.
- **Goal**: Implement a method with _wasted space_ and _runtime complexity_: O(x).

## Part 2 ##
- **Question**: Read input from the user one line at a time and output a line if it is the maximum over the last x lines, where x>=0 is a parameter to the doIt method. That is, output a line if there are at least x lines total, and this line is the maximum of the x-1 lines previous to the current one and the current one. For example, input lines “y”, “a”, “b”, “p”, “p” with x=3 would output “p”, “p” since p is the maximum of {a, b, p} and p the second p is the maximum of {b, p, p}. We don’t print out y because there are not 2 other elements to compare it to when we read it in. Note that with this definition, when x=0 every line is a maximum. As another example, input lines “x”, “e”, “b”, “e”, “c”, “d” with x=3 would output “e”. 
- **Goal**: Implement a method with _wasted space_ and _runtime complexity_: O(x).

## Part 3 ##
- **Question**: Read input from the user one line at a time and output a new line if it is a prefix of some previous line. For example, input lines “abc”, “def”, “abc”, “de”, “ef”, “efg” would output “abc”, “de” because they are prefixes of lines that come before them.
- **Goal**: Implement a method with _wased space_: O(s) - where _s_ is the number of unique lines. And _runtime complexity_: O(1)

## Part 4 ##
- **Question**: Read input from the user one line at a time and output a new line if it is a substring of some previous line. To get full points, try to use as little extra space and time as possible. For example, input lines “abc”, “def”, “abc”, “de”, “ef”, “efg” would output “abc”, “de”, “ef” because they are all substrings of lines that come before them.
- **Goal**: Implement a method with _wasted space_ and _runtime complexity_: O(k) - where _k_ is the number of suffixes.

## Part 5 ##
- **Question**:  Read input from the user one line at a time and for each line, output the minimum of all lines so far that start with ‘c’. If you ever read in the line ‘###’ remove the current minimum line that starts with ‘c’ before printing the (new) minimum, and continue. As with question 1, if no minimum exists, print a ‘*’ on its own line. When removing the minimum line, if no such minimum exists, just continue. For example, input lines “berry”, “apple”, “cheer”, “car”, “car”, “###”, “###” “add” would result in the output “*”, “*”, “cheer”, “car”, “car”, “car”, “cheer”, “cheer”.
- **Goal**: Implement a method with _wasted space_: O(n) - where _n_ is the number of lines. And _runtime complexity_: O(1).

## Part 6 ##
- **Question**: For this question, you may assume that every input line is distinct. A “step” is a line such that every line that follows it is greater than it. Read in the lines one at a time, and output all the steps. You may assume all lines are distinct. For example, input lines “f”, “d”, “a”, “c”, “b” would output “a”, “b”.
- **Goal**: Implement a method with _wasted space_: O(1). And _runtime complexity_: O(s) - where _s_ is the number of "_steps_".

## Part 7 ##
- Consider the following 2-player “_road trip_” game: player 1 starts with a word _w1_ (typically country or city); player 2 then names a new word _w2_ that starts with the last letter of _w1_. Player 1 then names a new word _w3_ that starts with the last letter of _w2_, and so on. For example, this game might play out as “_dortmund_”, “_dominican republic_, “_canada_”, “_ajax_”. Read in the input one line at a time, and output the fewest number of turns it might take for such a game that starts at line 1, ends at line _n_ (where _n_ is the total number of lines in the file), using only lines of the file as the possible words in between. If there is no way to play to get to the last line from the first line, output _0_. For example, the input “_dortmund_”, “_bermuda_”, “_canada_”, “_paris_”, “_dominican republic_”, “_ajax_” would return _4_ (“_dortmund_” -> “_dominican republic_” -> “_canada_” -> “_ajax_”), whereas the input “_dortmund_”, “_bermuda_”, “_canada_”, “_dominican republic_”, “_ajax_”, “_paris_” would return _0_ since there is no way of getting from “_dortmund_” to “_paris_” on just the input lines.
