def find_duplicate_counts(countries):
    counts = {}
    for country in countries:
        if country in counts:
            counts[country] += 1
        else:
            counts[country] = 1

    duplicates = {}
    for country, count in counts.items():
        if count > 1:
            duplicates[country] = count

    return duplicates


countries = ["Turkey", "Turkey", "India", "USA", "China", "Japan",
             "India", "Russia", "China", "USA", "Canada"]
duplicates = find_duplicate_counts(countries)
print("Duplicate countries and counts:", duplicates)
