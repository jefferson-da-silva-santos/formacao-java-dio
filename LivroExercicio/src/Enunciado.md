## Exercício Completo de POO em Java: Sistema de Gerenciamento de Biblioteca

Este exercício abrange os principais pilares da Programação Orientada a Objetos (POO) em Java, incluindo abstração, encapsulamento, herança, polimorfismo, getters e setters, construtores, enums, interfaces, pacotes e muito mais.

**Cenário:**

Você foi contratado para desenvolver um sistema de gerenciamento de biblioteca para uma pequena biblioteca local. O sistema deve permitir o cadastro de livros, usuários e empréstimos, além de fornecer funcionalidades para busca, reserva e devolução de livros.

**Requisitos:**

1.  **Abstração:** Identifique as entidades principais do sistema (Livro, Usuário, Empréstimo) e defina seus atributos e comportamentos relevantes.
2.  **Encapsulamento:** Utilize modificadores de acesso (private, public, protected) para controlar o acesso aos atributos e métodos das classes. Forneça métodos getters e setters para acessar e modificar os atributos quando necessário.
3.  **Herança:** Crie uma hierarquia de classes para representar diferentes tipos de livros (LivroFisico, Ebook) e usuários (Estudante, Professor).
4.  **Polimorfismo:** Utilize interfaces ou classes abstratas para definir comportamentos comuns entre as classes e implemente esses comportamentos de forma específica em cada classe.
5.  **Construtores:** Implemente construtores para inicializar os objetos com valores padrão ou personalizados.
6.  **Enums:** Utilize enums para representar estados (Disponível, Emprestado, Reservado) e categorias de livros (Ficção, Não-Ficção, Técnico).
7.  **Interfaces:** Crie interfaces para definir comportamentos comuns entre diferentes classes, como "Emprestavel" (para livros que podem ser emprestados) e "Reservavel" (para livros que podem ser reservados).
8.  **Pacotes:** Organize as classes em pacotes lógicos (modelo, serviço, util).
9.  **Tratamento de Exceções:** Implemente tratamento de exceções para lidar com erros e situações inesperadas, como livro não encontrado ou usuário inválido.
10. **Testes Unitários:** Escreva testes unitários para garantir a corretude das classes e métodos.

**Implementação:**

1.  **Pacotes:**

    * `modelo`: Contém as classes que representam as entidades do sistema (Livro, Usuário, Empréstimo, etc.).
    * `servico`: Contém as classes que implementam a lógica de negócios do sistema (ServicoLivro, ServicoUsuario, ServicoEmprestimo, etc.).
    * `util`: Contém classes utilitárias, como classes para formatação de datas e validação de dados.

2.  **Classes:**

    * `Livro`: Classe abstrata que representa um livro.
        * Atributos: `id`, `titulo`, `autor`, `categoria` (Enum), `estado` (Enum).
        * Métodos: getters e setters, métodos abstratos para calcular o preço do aluguel (polimorfismo).
    * `LivroFisico`: Classe que representa um livro físico, herda de `Livro`.
        * Atributos: `numeroPaginas`.
        * Métodos: implementa o método para calcular o preço do aluguel.
    * `Ebook`: Classe que representa um livro digital, herda de `Livro`.
        * Atributos: `tamanhoArquivo`.
        * Métodos: implementa o método para calcular o preço do aluguel.
    * `Usuario`: Classe abstrata que representa um usuário.
        * Atributos: `id`, `nome`, `endereco`, `telefone`.
        * Métodos: getters e setters, métodos abstratos para calcular o limite de empréstimo (polimorfismo).
    * `Estudante`: Classe que representa um estudante, herda de `Usuario`.
        * Atributos: `matricula`.
        * Métodos: implementa o método para calcular o limite de empréstimo.
    * `Professor`: Classe que representa um professor, herda de `Usuario`.
        * Atributos: `departamento`.
        * Métodos: implementa o método para calcular o limite de empréstimo.
    * `Emprestimo`: Classe que representa um empréstimo.
        * Atributos: `id`, `livro`, `usuario`, `dataEmprestimo`, `dataDevolucao`.
        * Métodos: getters e setters.
    * `ServicoLivro`: Classe que implementa a lógica de negócios para livros.
        * Métodos: `cadastrarLivro`, `buscarLivroPorId`, `buscarLivrosPorCategoria`, `reservarLivro`, `devolverLivro`.
    * `ServicoUsuario`: Classe que implementa a lógica de negócios para usuários.
        * Métodos: `cadastrarUsuario`, `buscarUsuarioPorId`.
    * `ServicoEmprestimo`: Classe que implementa a lógica de negócios para empréstimos.
        * Métodos: `realizarEmprestimo`, `realizarDevolucao`.
    * `Emprestavel`: Interface que define o comportamento de livros que podem ser emprestados.
        * Métodos: `emprestar`.
    * `Reservavel`: Interface que define o comportamento de livros que podem ser reservados.
        * Métodos: `reservar`.

3.  **Enums:**

    * `CategoriaLivro`: Enum que representa as categorias de livros (Ficção, Não-Ficção, Técnico).
    * `EstadoLivro`: Enum que representa os estados de um livro (Disponível, Emprestado, Reservado).

4.  **Exemplo de uso:**

```java
public class Main {
    public static void main(String[] args) {
        ServicoLivro servicoLivro = new ServicoLivro();
        ServicoUsuario servicoUsuario = new ServicoUsuario();
        ServicoEmprestimo servicoEmprestimo = new ServicoEmprestimo();

        LivroFisico livro1 = new LivroFisico(1, "Dom Casmurro", "Machado de Assis", CategoriaLivro.FICCAO, 250);
        servicoLivro.cadastrarLivro(livro1);

        Estudante usuario1 = new Estudante(1, "João", "Rua A, 123", "1234-5678", "123456");
        servicoUsuario.cadastrarUsuario(usuario1);

        servicoEmprestimo.realizarEmprestimo(livro1, usuario1);
    }
}
```

Este é um exemplo abrangente de como você pode implementar um sistema de gerenciamento de biblioteca utilizando os principais pilares da POO em Java. Lembre-se de adaptar e expandir este exemplo de acordo com as necessidades específicas do seu projeto.
