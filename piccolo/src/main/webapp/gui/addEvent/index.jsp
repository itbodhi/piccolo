<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add an event</title>
<link rel="stylesheet" type="text/css" href="form.css">
</head>
<body>
<div class="container">
            <form class="form-horizontal" role="form">
                <h2>Event Registration</h2>
                <div class="form-group">
                    <label for="eventName" class="col-sm-3 control-label">Event Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="eventName" placeholder="Event Name" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="ageGroup" class="col-sm-3 control-label">Age Group</label>
                    <div class="col-sm-9">
                        <select id="ageGroup" class="form-control">
                        <option>6</option>
                        <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                        </select>
                    </div>
                    <!-- <span> to </span> -->
                    <div class="col-sm-12" style="margin-left: 55%; font-size: 12px; padding: 1%">to</div>
                    <div class="col-sm-9">
                        <select id="ageGroup" style="margin-left: 36%" class="form-control">
                        <option>6</option>
                        <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="startDate" class="col-sm-3 control-label">Start Date</label>
                    <div class="col-sm-9">
                        <input type="date" id="startDate" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="startDate" class="col-sm-3 control-label">End Date</label>
                    <div class="col-sm-9">
                        <input type="date" id="End Date" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="activityType" class="col-sm-3 control-label">Type of Activity</label>
                    <div class="col-sm-9">
                        <select id="activityType" class="form-control">
                            <option>Science</option>
                            <option>Reading</option>
                            <option>Math</option>
                            <option>Critical Thinking</option>
                            <option>Art</option>
                            <option>Craft</option>
                            <option>Drawing</option>
                            <option>Story Writing</option>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label class="control-label col-sm-3">Location</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-9">
                                <label class="radio-inline">
                                    <input type="radio" id="location1" value="newDelhi">New Delhi
                                </label>
                            </div>
                            <div class="col-sm-9">
                                <label class="radio-inline">
                                    <input type="radio" id="location2" value="Ghaziabad">Ghaziabad
                                </label>
                            </div>
                            <div class="col-sm-9">
                                <label class="radio-inline">
                                    <input type="radio" id="location3" value="Noida">Noida
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">I accept terms & conditions.
                            </label>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
            </form> <!-- /form -->
        </div> <!-- ./container -->
        </body>
        </html>