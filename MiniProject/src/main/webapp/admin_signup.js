/**
 * 
 */
function checkPassword(form) {
    // 👇 get passwords from the field using their name attribute
    const password = form.password.value;
    const confirmPassword = form.password2.value;
    const errorText = document.querySelector(".error-text");

    // 👇 check if both match using if-else condition
    if (password != confirmPassword) {
      errorText.style.display = "block";
             errorText.classList.remove("matched");
             errorText.textContent = "Error! Confirm Password Not Match";
             return false;
    } if(password == confirmPassword) {
      alert("Password Match. Congratulations!");
      window.location="admin_login.jsp";
     
      
    }
  }