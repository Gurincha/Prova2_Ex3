public class Principal {
 public static void main(String[] args) {
     PessoaFisica PessoaFisica = new PessoaFisica();
     PessoaJuridica PessoaJuridica = new PessoaJuridica();

     PessoaFisica.setNome("Gustavo Nitcipurenco Rincha.");
     PessoaFisica.setCPF("362.091.998.55");
     PessoaFisica.setEndereco("Tupã-SP");

     PessoaJuridica.setNome("Rodolfo");
     PessoaJuridica.setCNPJ("62.365.558/00001-58");

     PessoaJuridica.setEndereco("Curitiva-PR");

     System.out.println("\nInformações de " + PessoaFisica.getNome() + ":");
     System.out.println("Endereço:" + PessoaFisica.getEndereco() + ".");
     System.out.println("CPF:" + PessoaFisica.getCPF() + ".");

     System.out.println("\nInformações de " + PessoaJuridica.getNome() + ":");
     System.out.println("Endereço:" + PessoaJuridica.getEndereco() + ".");
     System.out.println("CPF:" + PessoaJuridica.getCNPJ() + ".");

 }   
}