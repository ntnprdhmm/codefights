def websiteCalendar(month, year):
    import calendar
    c = calendar.HTMLCalendar()
    return ''.join(c.formatmonth(year, month).split('\n'))
        
