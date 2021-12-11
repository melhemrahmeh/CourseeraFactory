# CourseeraFactory
A program that downloads then parses all 26 files containing all the courses taught for the current semester at the American University of Beirut
from this site https://www-banner.aub.edu.lb/catalog/schedule_header.html 
Then build an in-memory database with all the courses, 
then allow the user to query the database using command line interface and/or a Telegram Bot called @nathalie_melhem_telegram_bot.

The queries type:
	allroomSchedule: lists the schedule for every room in alphabetical room number order \n
	roomSchedule : lists the schedule for a specific room      \n
	roomSchedule + date: lists the schedule for a specific room for a specific date  \n
	roomSchedule + a day of the week : lists the schedule for a specific room for a specific day of week \n
	whoWasThereLast: lists the course and instructor name for the last time this room was occupied   \n
	whoIsThereNow: lists the course and instructor name currently occupying a specific room    \n
  	profSchedule: lists the instructor's weekly schedule (day, time, room)    \n
	whereIsProf : lists the room where a prof is currently teaching (if any)         \n
	whereWillProfBe : lists the instructor's schedule for today       \n
