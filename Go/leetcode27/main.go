package main

import "fmt"

func main() {
	nums := []int{3, 2, 2, 3}
	count := removeElement(nums, 3)
	fmt.Println(count)
}
func removeElement(nums []int, val int) int {
	left := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] != val {
			nums[left] = nums[i]
			left++
		}
	}
	return left
}
