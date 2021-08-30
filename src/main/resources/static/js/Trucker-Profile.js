const confirmEdit = document.getElementById("confirm-edit");

    function edit() {
        var x = document.getElementById("edit-container");
        var y = document.getElementById("job-container");
        if(y.style.display === "flex")
        {
            y.style.display = "none";
            if (x.style.display === "none") {
                x.style.display = "flex";
              } else {
                x.style.display = "none";
              }
        }
        else{
            if (x.style.display === "none") {
                x.style.display = "flex";
              } else {
                x.style.display = "none";
              }
        }
      } 

      function job() {
        var x = document.getElementById("job-container");
        var y = document.getElementById("edit-container");
        if(y.style.display === "flex")
        {
            y.style.display = "none";
            if (x.style.display === "none") {
                x.style.display = "flex";
              } else {
                x.style.display = "none";
              }
        }
        else{
            if (x.style.display === "none") {
                x.style.display = "flex";
              } else {
                x.style.display = "none";
              }
        }
       
      }  

      function validateEdit(){
        var companyName = document.getElementById("companyName").value;
        var password = document.getElementById("password").value;
        var location = document.getElementById("location").value;
        var description = document.getElementById("description").value;
        var contactInfo = document.getElementById("contactInfo").value;
        if(companyName === "" || password === "" || location === "" || description === "" || contactInfo === ""){
          alert("Please fill in all of the fields!");
        }
        else if(companyName != "" && password != "" && location != "" && description != "" && contactInfo != ""){
          document.getElementById("companyName").value = "";
          document.getElementById("password").value = "";
          document.getElementById("location").value = "";
          document.getElementById("description").value = "";
          document.getElementById("contactInfo").value = "";
          alert("Information Saved!");
        }
      }

      function validateJob(){
        var jobName = document.getElementById("jobName").value;
        var jobLocation = document.getElementById("jobLocation").value;
        var destination = document.getElementById("destination").value;
        var time = document.getElementById("time").value;

        if(jobName === "" || jobLocation === "" || destination === "" || time === ""){
          alert("Please fill in all of the fields!");
        }
        else if(jobName != "" && jobLocation != "" && destination != "" && time != ""){
          document.getElementById("jobName").value = "";
          document.getElementById("jobLocation").value = "";
          document.getElementById("destination").value = "";
          document.getElementById("time").value = "";
          alert("Information Saved!");
        }
      }