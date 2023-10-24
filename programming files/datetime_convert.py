from datetime import datetime

#y-m-d input date
date_str = "2022-03-17 10:45:30"

#makes y-m-d date
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')

#reformats date to m-d-y
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

#prints reformated date
print(formatted_date)
