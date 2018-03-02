def pressureGauges(morning, evening):
    return [list(map(min, zip(evening, morning))), list(map(max, zip(evening, morning)))]
