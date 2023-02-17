package main

import "fmt"

func findDuplicateCounts(countries []string) map[string]int {
	counts := make(map[string]int)
	for _, country := range countries {
		counts[country]++
	}

	duplicates := make(map[string]int)
	for country, count := range counts {
		if count > 1 {
			duplicates[country] = count
		}
	}

	return duplicates
}

func main() {
	countries := []string{"India", "USA", "China", "Japan", "India", "Russia", "China", "USA", "Canada"}
	duplicates := findDuplicateCounts(countries)
	fmt.Println("Duplicate countries and counts:", duplicates)
}
