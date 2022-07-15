package main

import "fmt"

func main() {
	i := generate(5)
	fmt.Println(i)
}
func generate(numRows int) [][]int {
	arr := make([][]int,numRows)
	for i := 0; i < numRows; i++ {
		arr[i] = make([]int, i+1)
		arr[i][0]=1
		arr[i][i] = 1
		for j := 1; j <= i/2; j++ {
			arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
			arr[i][i-j] = arr[i][j]
		}
	}
	return arr
}