package main

import "fmt"

func main() {
	arr := []int{99, 2, 42, 10, 0, 22, 1}
	i := 0
	var temp int
	for i < len(arr) {
		j := i + 1
		for j < len(arr) {
			if arr[i] > arr[j] {
				temp = arr[i]
				arr[i] = arr[j]
				arr[j] = temp
			}
			j++
		}
		i++
	}

	fmt.Printf("after \n %v", arr)
}
