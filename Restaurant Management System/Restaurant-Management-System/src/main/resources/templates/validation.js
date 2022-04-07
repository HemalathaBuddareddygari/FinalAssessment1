function validate() {
  let x1 = document.getElementById("RestaurantName");
  if (x1.value == "") {
    document.getElementById("p1").innerHTML = "* should not be empty*";
    return false;

  }
  else
  {
  return false;
  }

  let x2 = document.getElementById("RestaurantAddress");
  if (x2.value == "") {
    document.getElementById("p2").innerHTML = "should not be empty*";
    return true;
    }
    else
    {
    return true;
    }

}