def correctScholarships(bestStudents, scholarships, allStudents):
    return set(bestStudents).intersection(set(scholarships)) == set(bestStudents) \
        and set(scholarships).intersection(set(allStudents)) == set(scholarships) \
        and set(scholarships) != set(allStudents)
