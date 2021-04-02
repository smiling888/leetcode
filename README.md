# log
0328 前缀和思想和滑动窗口会经常用在求子数组和子串问题:wq
https://leetcode-cn.com/problems/subarray-sum-equals-k/solution/de-liao-yi-wen-jiang-qian-zhui-he-an-pai-yhyf/
0327 旋转数组。使用空间置换  .相似的链表旋转。反转字符串


# leetcode

1 类命名方式。L后面数字对应着leetcode 题目编号。

0129- L1,L2

链表
- 移除链表元素：L203
- 移除数据中的元素：L27

2 快慢指针：
 - L18 删除倒数第N个节点。
 - 链表是否有环
 - 双指针 L11 成最多水的容器。167. 两数之和 II - 输入有序数组。  

3 回溯算法
 - L79 单词搜索：再字母矩阵中搜索单词
 - L39 组合求和
 - L46 全排列
 
4 数组
 -  L566matrixReshape -重塑矩阵
  
5 异或特性
 - 1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现一次。每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空间，能否设计一个算法实现？
 - 一个数组存放若干整数，一个数出现奇数次，其余数均出现偶数次，找出这个出现奇数次的数？
 - L172 异或运算都逆运算
 

 6 字符串
 - L6 字符z形变换

7  滑动窗口
 - L3找出最长子字符串

8 区间计算
 - L57 插入区间

9 滑动窗口
 - 438找到字符串中所有字母）
 
10 动态规划：动态规划问题的一般形式就是求最值。求解动态规划的核心问题是穷举。因为要求最值，肯定要把所有可行的答案穷举出来，然后在其中找最值呗。

明确 base case -> 明确「状态」-> 明确「选择」 -> 定义 dp 数组/函数的含义。
1  定义dp数据
2 定义dp请求方式
3 dp初始状态
动态规划解释：https://zhuanlan.zhihu.com/p/78220312
自底向上，
 - L322
 - 139 单词拆分
 - 最长公共子序列
 - 斐波那契数列
 - 凑零钱问题：给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，再给一个总金额 amount，问你最少需要几枚硬币凑出这个金额，如果不可能凑出，算法返回 -1 。算法的函数签名如下。
 比如说 k = 3，面值分别为 1，2，5，总金额 amount = 11。那么最少需要 3 枚硬币凑出，即 11 = 5 + 5 + 1。
 

刷题公众号：
https://labuladong.gitbook.io/algo/bi-du-wen-zhang