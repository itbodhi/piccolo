<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
.custom
       {
       width:100px;
       }
       
</style>
</head>
<body>



    <h2>VIEW EVENT LIST</h2>
  
  		<div class="container">
  
  <div class="btn-group">
    <button type="button" class="btn btn-primary">Event list</button>
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu">
      <li><a href="#">Location wise</a></li>
      <li><a href="#">Age Group</a></li>
      <li><a href="#">Price wise</a></li>
    </ul>
    </div>
    <div class="btn-group">
    <button type="button" class="btn btn-primary">Category</button>
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu">
      <li><a href="#">Demanded events</a></li>
      <li><a href="#">Running events</a></li>
      <li><a href="#"></a></li>
    </ul>
    </div>
    <div class="btn-group">
    <button type="button" class="btn btn-primary">Actions</button>
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu">
      <li><a href="#">Accept</a></li>
      <li><a href="#">Remove</a></li>
      <li><a href="#">Add new event</a></li>
    </ul>
  </div>
</div>	
<br><br>
<table style='table-layout:fixed;width:100%' border='1'>
<tr>
		<td style='width: 30%;'>
		     Event 1:
		     <ul style="list-style-type:disc"><li>Time:</li>
		     <li>Place:</li>
		     <li>Charge:</li>
		     </ul>
	  </td>
	  <td style='width: 100px;'>
		<div class="container">
  <button type="button" class="btn btn-success btn-sm custom" data-toggle="modal" data-target="#myModal1">View Vendor</button>

  <div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Vendor Name</h4>
        </div>
        <div class="modal-body">
          <p>
          </p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</div>
</div>
</td>
</tr>
<tr>
		<td>
			 Event 2:
		     <ul style="list-style-type:disc"><li>Time:</li>
		     <li>Place:</li>
		     <li>Charge:</li>
		     </ul>
		</td>
		<td>
		<div class="container">
  <button type="button" class="btn btn-success btn-sm custom" data-toggle="modal" data-target="#myModal2">View Vendor</button>

  <div class="modal fade" id="myModal2" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Vendor Name</h4>
        </div>
        <div class="modal-body">
          <p>
          </p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</div>
</div>
</td>
		
</tr>
<tr>
		<td>
		     Event 3:
		     <ul style="list-style-type:disc"><li>Time:</li>
		     <li>Place:</li>
		     <li>Charge:</li>
		     </ul>	
		</td>
		<td>
		<div class="container">
  <button type="button" class="btn btn-success btn-sm custom" data-toggle="modal" data-target="#myModal1">View Vendor</button>

  <div class="modal fade" id="myModal3" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Vendor Name</h4>
        </div>
        <div class="modal-body">
          <p>
          </p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</div>
</div>
</td>
		
</tr>
</table>
</body>
</html>