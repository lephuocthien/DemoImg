axios({
    url: "http://localhost:8080/api/test/get-all",
    method: "GET"
})
    //Xữ lý mã trạng thái bắt đầu bằng số 2
    .then(function (response) {
        console.log(response.data);
        let tbody = document.getElementById("testImg");
        let content = '';
        for(item of response.data ) {
            content +=`
            <p>Taken from wikpedia</p>
            <img id="testImg" src="${item.imgBase64}" alt="jnfksnksjf" />
            `;
        }
        //Truy xuất đến thẻ body( nơi sẽ chứa giao diện)
        // let tbody = document.getElementById("testImg");
        //Thay đổi nội dung thẻ tbody
        // document.getElementById("testImg").setAttribute("src", response.data.imgBase64);
        tbody.innerHTML = content;
    })
    //Xữ lý mã trạng thái còn lại
    .catch(function (e) {
        console.log(e.response)
    });