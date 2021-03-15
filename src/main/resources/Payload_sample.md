Sample Request Payload:
----------------
{
    "email":"xxxxxxxxx@gmail.com",
    "subject":"Things I wanna say to my Future self",
    "body":"Dear Future me, <br><br> <b>Think Big And Don’t Listen To People Who Tell You It Can’t Be Done. Life’s Too Short To Think Small.</b> <br><br> Cheers, <br>Dinesh!",
    "dateTime":"2021-03-15T05:12:00",
    "timeZone":"Asia/Kolkata"
}

Sample Response Payload:
-------------------------

{
    "success": true,
    "jobId": "198b1247-83fb-4e55-97a9-6b3905786032",
    "jobGroup": "email-jobs",
    "message": "Email Scheduled Successfully!"
}

Local URL to scheduleEmail:  http://localhost:8080/scheduleEmail