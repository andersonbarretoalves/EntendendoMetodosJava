# Entendendo Método Java

---
## Criação
### Conceito de Métodos

**Conteito:**
É uma porção de código (sub-rotina) que é disponobilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado compoirtamento.
---

#### Padrão de definição:

* **Visibilidade:** public, protected e private.
* **Tipo:** concreto ou abstrato.
* **Modificador:** static ou final.
* **Retorno:** tipo de dado ou void.
* **Nome:** nome que é fornecido ao método.
* **Parâmetros:** parâmetros que pode receber.
* **Exceções:** exceções que pode lançar.
* **Corpo:** código que possui ou vazio.

**Exemplos:**<br>
public String getNome(){...}<br>
public double calcularTotalNota(){...}<br>
public int verificarDistancia(int coordenada1, int coordenada2) {...}<br>
public abstract void executar();<br>
public void alterarFabricante(Fabricante fabricante) {...}<br>
public Relatorio GerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {...}<br>

public static R N(P) {...}

---

#### Utilização:
passa-se uma mensagem através de uma classe ou objeto.

**Exemplos:**<br>
nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);
nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);
math.random(); ou Math.sqrt(4);
usuario.getEmail(); ou usuario.alterarEndereco(endereco); 

---

#### Particularidades:

* **Assinatura:** é a forma de identificar unicamente o método.<br>
    Ass = nome + parâmetros<br>
**Métodos:**<br>
    public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){...}<br>
**Assinatura:**<br>
calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3)
* **Contrutor e Destrutor:** são métodos especiais usados na Orientação a Objetos.
* **Mensagem:** é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.
* Passagem de parâmetros:
  * Por valo (cópia)<br>
  **Exemplo:**<br>
  
        int i = 10;
        public void fazerAlgo (int i){  
            i = i +10;
            System.out.println("valor de i dentro: " + i);
        }
        System.out.println("valor de i fora: " + i);
  * Por referência (endereço)

---
#### Boas práticas
* Nomes devem ser descritivos, mas curtos
  * Notação camelo<br>
  **Exemplos:**<br>
verificarSaldo();<br>
executarTransferencia(...);<br>
ExisteDebito();
  * Deve possuir entre 80 e 120 linhas
  * Evite lista de parâmetros longas
  * Visibilidades adequadas