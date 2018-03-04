def maliciousProgram(curDate, changes):
    from datetime import datetime
    datetime_object = datetime.strptime(curDate, '%d %b %Y %H:%M:%S')
    try:
        datetime_object = datetime_object.replace(day=datetime_object.day+changes[0],
                                                  month=datetime_object.month+changes[1],
                                                  year=datetime_object.year+changes[2],
                                                  hour=datetime_object.hour+changes[3],
                                                  minute=datetime_object.minute+changes[4],
                                                  second=datetime_object.second+changes[5])
    except ValueError:
        return curDate
    return datetime_object.strftime('%d %b %Y %H:%M:%S')
