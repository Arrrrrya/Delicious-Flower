package com.syl.test_951_1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标，不可重复
 * 
 * @from https://leetcode-cn.com/problems/two-sum/
 * @author Arya
 * @email sun_mir@qq.com
 */
public class _956_SumDemo {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 26;
		
		Map<Integer, Integer> resultMap = getTwoNumbers(nums, target);
		
		Set<Entry<Integer, Integer>> set = resultMap.entrySet();
		
		for (Entry<Integer, Integer> obj : set) {
			System.out.println(obj.getKey() + " : " + obj.getValue());
		}
	}

	private static Map<Integer, Integer> getTwoNumbers(int[] nums, int target) {
		// resultMap, key是值, value是在数组中的下标
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					resultMap.put(nums[i], i);
					resultMap.put(nums[j], j);
				}
			}
		}
		return resultMap;
	}

}
