function Register(){
   location.href="register.html";
}

function ConfirmRegister(){
    alert("Cadastro realizado com sucesso!");
    return true;
}

function Logon(){
    if (document.getElementById("username").value == "leandro" ){
        return true;
    }else{
        alert("Usuario ou senha invalidos!");
        return false;
    }

}