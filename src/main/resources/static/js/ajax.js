
function ajax(data) {
    var xhr = new XMLHttpRequest();
    //"POST" "/test2/test3"
    xhr.open("POST","/test2/test3" , true);
    xhr.setRequestHeader("Content-Type", "application/json");

    xhr.onreadystatechange = function()
    {
        if (xhr.readyState === 4 && xhr.status === 200)
        {
            var response = xhr.responseText;
            alert(JSON.stringify(response));
        }
    };
    xhr.send(JSON.stringify(data))
}
