$(document).ready(function(){
    $('#eye').click(function(){
        console.log('Button clicked!');
        $(this).toggleClass('open');
        $(this).children('i').toggleClass('fa-eye-slash fa-eye');
        if($(this).hasClass('open')){
            $(this).prev().attr('type', 'text');
        }else{
            $(this).prev().attr('type', 'password');
        }
    });
});
$(document).ready(function() {
    // Bắt sự kiện click vào nút "Đăng ký tài khoản"
    $(".form-toggle").click(function() {
        // Ẩn Form đăng nhập và hiển thị Form đăng ký
        $("#form-login").hide();
        $("#form-register").show();
    });

    // Bắt sự kiện click vào nút "Đăng nhập tài khoản"
    $(".form-toggle-login").click(function() {
        // Ẩn Form đăng ký và hiển thị Form đăng nhập
        $("#form-register").hide();
        $("#form-login").show();
    });
});