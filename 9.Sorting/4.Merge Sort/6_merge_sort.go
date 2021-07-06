package main

func show(arr []int, msg string) {
	println(msg)
	for i := 0; i < len(arr); i++ {
		print(arr[i], " ")
	}
	println()
}

func merge(arr []int, start int, mid int, end int) {
	l := mid - start + 1
	r := end - mid
	templ := make([]int, l)
	tempr := make([]int, r)

	for i := 0; i < l; i++ {
		templ[i] = arr[start+i]
	}
	for i := 0; i < r; i++ {
		tempr[i] = arr[mid+i+1]
	}
	i := 0
	j := 0
	k := start
	for i < l && j < r {
		if templ[i] <= tempr[j] {
			arr[k] = templ[i]
			i++
		} else {
			arr[k] = tempr[j]
			j++
		}
		k++
	}

	for i < l {
		arr[k] = templ[i]
		i++
		k++
	}
	for j < r {
		arr[k] = tempr[j]
		i++
		j++
	}

}

func mergesort(arr []int, start int, end int) {
	if start < end {
		var mid int = start + (end-start)/2
		mergesort(arr, start, mid)
		mergesort(arr, mid+1, end)
		merge(arr, start, mid, end)
	}

}

func main() {
	arr := []int{22, 9, 3, 55, 43, 0, 1}
	show(arr, "before")
	mergesort(arr, 0, len(arr)-1)
	show(arr, "after")

}
