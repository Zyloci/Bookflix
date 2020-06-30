
async function loginFunction() {
    var url = window.location.href;
    url = url + "select";
    window.location.href = url;
}

async function backMenuFunction(){
    var url = window.location.href;
    url = "http://localhost:8080/select";
    window.location.href = url;
}

async function infoFunction(){
    var url = window.location.href;
    url = "http://localhost:8080/info";
    window.location.href = url;
}

async function listFunction(){
    var url = window.location.href;
    url = "http://localhost:8080/books";
    window.location.href = url;
}