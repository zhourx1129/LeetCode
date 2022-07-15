package main

import "fmt"

func main() {
	i := getRow(3)
	fmt.Println(i)
}
func getRow(rowIndex int) []int {
	arr:=make([][]int,rowIndex+1)
	for i := 0; i <= rowIndex; i++ {
		arr[i] = make([]int, i+1)
		arr[i][0] = 1
		arr[i][i] = 1
		for j := 1; j <= i/2; j++ {
			arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
			arr[i][i-j] = arr[i][j]
		}
	}
	return arr[rowIndex]
}