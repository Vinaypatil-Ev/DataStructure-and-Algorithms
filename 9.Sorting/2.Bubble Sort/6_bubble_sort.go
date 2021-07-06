package main

import "fmt"

func bubbleSort(arr []int) {
	for i := len(arr) - 1; i > 0; i-- {
		for j := len(arr) - 1; j > 0; j-- {
			if arr[j] < arr[j-1] {
				temp := arr[j]
				arr[j] = arr[j-1]
				arr[j-1] = temp
			}
		}
	}
}

func show(arr []int, msg string) {
	println(msg)
	fmt.Printf("%v\n", arr)
}

func main() {
	arr := []int{7, 10, 43, 0, 9, 11, 2}
	show(arr, "before")
	bubbleSort(arr)
	show(arr, "after")
}
