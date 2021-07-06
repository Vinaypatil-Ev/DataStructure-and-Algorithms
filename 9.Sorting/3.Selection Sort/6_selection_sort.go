package main

import "fmt"

func getMinIndex(arr []int, start int) int {
	i := start
	index := i
	for i < len(arr) {
		if arr[i] < arr[index] {
			index = i
		}
		i++
	}
	return index
}

func swap(arr []int, x int, y int) {
	temp := arr[x]
	arr[x] = arr[y]
	arr[y] = temp
}

func selSort(arr []int) {
	for i := 0; i < len(arr); i++ {
		min := getMinIndex(arr, i)
		swap(arr, i, min)
	}
}

func show(arr []int, msg string) {
	println(msg)
	fmt.Printf("%v", arr)
}

func main() {
	arr := []int{22, 1, 9, 13, 2, 0, 12}
	show(arr, "before")
	selSort(arr)
	show(arr, "after")
}
