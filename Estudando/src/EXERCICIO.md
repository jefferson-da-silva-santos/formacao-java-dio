Boa! 💪 Bora treinar essa POO do jeito raiz com Java! Aqui vai um exercício clássico, direto e reto, que envolve **classes, herança, encapsulamento e polimorfismo** — tudo que a boa Programação Orientada a Objetos pede:

---

### 💼 **Exercício: Sistema de Funcionários de uma Empresa**

#### 🧾 Enunciado:

Crie um sistema simples para gerenciar funcionários de uma empresa. A empresa possui dois tipos de funcionários:

* **Funcionário Comum**
* **Gerente** (que recebe bônus)

#### 📋 Regras:

1. Crie uma **classe abstrata** chamada `Funcionario` com os seguintes atributos:

    * `nome` (String)
    * `salarioBase` (double)
    * Método abstrato: `double calcularSalarioFinal()`

2. Crie a classe `FuncionarioComum` que **herda** de `Funcionario` e implementa o método `calcularSalarioFinal()` retornando apenas o `salarioBase`.

3. Crie a classe `Gerente` que também **herda** de `Funcionario`, mas que tenha um atributo extra:

    * `bonus` (double)
    * O método `calcularSalarioFinal()` deve retornar `salarioBase + bonus`

4. Crie uma classe `Empresa` com um método `mostrarFolhaDePagamento(List<Funcionario> funcionarios)` que imprime o nome e o salário final de cada funcionário.

---

### 🧪 Desafio Extra (opcional):

Implemente encapsulamento com **getters e setters**, e adicione uma **interface** chamada `Bonificavel` com um método `getBonificacao()`, que deve ser implementado pela classe `Gerente`.

---

### 🧠 Objetivo:

* Treinar **abstração, herança, polimorfismo e encapsulamento**
* Trabalhar com **listas e estrutura de classes**
* Sair um pouco do CRUD básico

---

Se quiser, posso montar a estrutura base do código pra você começar. Só falar! 🧑‍💻🔥
