<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/homepage.css">
</head>
<body>

	<div class="header">


		<div style="text-align: left">
			<img style="float: left; margin: 40px 0px 15px 15px;" src="mwcd.jpg"
				height="145" width="160">
		</div>

		<h1>MINISTRY OF WOMEN AND CHILD DEVELOPMENT</h1>
		<p>A GOVERNMENT OF INDIA INITIATIVE</p>
	</div>

	<div class="topnav">
		<a href="homepage.jsp">HOME</a> <a href="#">STEP</a> <a
			href="ngoregistration.jsp">NGO</a> <a href="aboutus.jsp">ABOUT US</a>
		<a href="contactus.jsp">CONTACT US</a> <a href="faqs.jsp">FAQ</a>

		<!-- <div class="dropdown" style="float: right">
			<a href="#" class="dropbtn">LOGIN <i class="fa fa-caret-down"></i>
			</a>
			<div class="dropdown-content">
				<a href="userlogin.jsp">User Login</a> <a href="adminlogin.jsp">Admin
					Login</a>
					<a href="userlogin.jsp">User Login</a> <a href="adminlogin.jsp">Admin
						Login</a>
			</div>
		</div> -->
     

		<!-- <div class="dropdown" style="float: right">
			<button class="dropbtn">LOGIN 
			  <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
					<a href="#">User Login</a>
			  <a href="#">Admin Login</a>
			  
			  
			</div>
		  </div>  -->
		  
		 

		  <div class="dropdown" style="float: right">
				<button class="dropbtn">   LOGIN
				  <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
						<a href="viewUserLoginPage">User Login</a>
						<a href="viewAdminLoginPage">Admin Login</a>
								
				</div>
			  </div> 








	</div>

	<div class="row">
		<div class="leftcolumn">
			<div class="card">
				<h2>STEP</h2>
				<h3>
					Support to Training and Employment Programme for Women
					</h>
					<div class="fakeimg" style="height: 400px;">
						<img src="HANDLOOM.jpg" height="350" width="850">
					</div>

					<h3>About Scheme</h3>
					<p>The Ministry has been administering "Support to Training and
						Employment Programme for Women (STEP) Scheme" since 1986-87 as a
						"Central Sector Scheme". The STEP Scheme aims to provide skills
						that give employability to women and to provide competencies and
						skill that enable women to become self-employed/entrepreneurs. The
						Scheme is intended to benefit women who are in the age group of 16
						years and above across the country. The grant under the Scheme is
						given to an institution/ organisation including NGOs directly and
						not the States/ UTs. The assistance under STEP Scheme will be
						available in any sector for imparting skills related to
						employability and entrepreneurship, including but not limited to
						the Agriculture, Horticulture, Food Processing, Handlooms,
						Tailoring, Stitching, Embroidery, Zari etc, Handicrafts, Computer
						& IT enable services along with soft skills and skills for the
						work place such as spoken English, Gems & Jewellery, Travel &
						Tourism, Hospitality.</p>
			</div>


			<div class="card">
				<h2>SUKANYA SAMRUDDHI YOJANA</h2>
				<div class="fakeimg" style="height: 400px;">
					<img class="mySlides" src="SUKANYA1.jpg" height="350" width="850">
					<img class="mySlides" src="SUKANYA2.jpg" height="350" width="850">
					<img class="mySlides" src="SUKANYA3.jpg" height="350" width="850">


					<!-- <img class="mySlides" src="img_la.jpg" style="width:100%">
                <img class="mySlides" src="img_ny.jpg" style="width:100%">
                <img class="mySlides" src="img_chicago.jpg" style="width:100%"> -->


					<script>
						var myIndex = 0;
						carousel();

						function carousel() {
							var i;
							var x = document.getElementsByClassName("mySlides");
							for (i = 0; i < x.length; i++) {
								x[i].style.display = "none";
							}
							myIndex++;
							if (myIndex > x.length) {
								myIndex = 1
							}
							x[myIndex - 1].style.display = "block";
							setTimeout(carousel, 3000); // Change image every 3 seconds
						}
					</script>





				</div>

				<h3>ABOUT SUKANYA SAMRUDDHI YOJANA</h3>
				<p>The government has taken up various measures in terms of
					education and financial freedom for the girl child. Sukanya
					Samriddhi Yojana is one such government back scheme to help parents
					save for the education and marriage of the girl child from the
					start itself.Sukanya Samriddhi Yojana is a small saving scheme,
					which can be opened in post offices and designated private and
					public banks in the form of a savings account in the name of the
					baby girl. The interest rate is declared quarterly just like other
					post office schemes. The interest rate for Jan-Mar’19 (Q4, FY
					2018-19) was 8.5%.It is regarded as one of the most high-paying
					investment options in the fixed income segment.</p>
			</div>
		</div>
		<div class="rightcolumn">
			<div class="card">
				<h2>About US</h2>
				<div class="fakeimg" style="height: 100px;">Image</div>
				<p></p>
			</div>
			<div class="card">
				<h3>Popular Post</h3>
				<div class="fakeimg">
					<p>Image</p>
				</div>
				<div class="fakeimg">
					<p>Image</p>
				</div>
				<div class="fakeimg">
					<p>Image</p>
				</div>
			</div>
			<div class="card">
				<h3>Follow Me</h3>
				<p>Some text..</p>
			</div>
		</div>
	</div>

	<div class="footer">
		<p>Website Content Managed by Ministry of Women and Child
			Development, GOI Designed, Developed and Hosted by National
			Informatics Centre( NIC ) Last Updated: 31 May 2019</p>
	</div>

</body>
</html>
