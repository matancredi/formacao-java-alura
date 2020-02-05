// A interface é um contrato
// Quem a implementar terá que implementar os métodos setSenha e autentica

//Ao passo em que só é possível fazer com que uma classe herde apenas uma outra classe, 
//podemos fazer com que sejam "assinados" tantos "contratos" quanto necessário, ou seja, 
//não há limite para o número de implementações.

// Interface também é polimorfismo

public abstract interface Autenticavel{

    // private int senha;

    public abstract void setSenha(int senha);
    //{
        //this.senha = senha;
    //}

    public abstract boolean autentica(int senha); 
//    {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
	
}
