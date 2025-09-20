document.getElementById('loginForm').addEventListener('submit', function (e) {
  e.preventDefault();

  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value;

  // Fake validation (replace with backend logic)
  if (email === "user@example.com" && password === "password123") {
    alert("Login successful!");
    window.location.href = "dashboard.html"; // Redirect after login
  } else {
    alert("Invalid email or password");
  }
  
});
