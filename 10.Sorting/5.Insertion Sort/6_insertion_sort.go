package main

import "fmt"

func show(arr []int, msg string) {
	fmt.Printf("%s\n%v\n", msg, arr)
}

func insSort(arr []int) {
	for i := 1; i < len(arr); i++ {
		current := arr[i]
		j := i - 1
		for j >= 0 && arr[j] > current {
			arr[j+1] = arr[j]
			j--
		}
		arr[j+1] = current
	}
}

func main() {
	arr := []int{15, 6, 28, 1, 10, 42}
	show(arr, "before")
	insSort(arr)
	show(arr, "after")
}
