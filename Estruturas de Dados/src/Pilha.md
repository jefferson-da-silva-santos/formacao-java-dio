Em Java, **pilhas (stacks)** são estruturas muito utilizadas em algoritmos de backtracking, parsing, chamadas recursivas e controle de execução. Abaixo estão as **principais opções para trabalhar com pilhas**, suas características e usos recomendados:

---

### 📌 1. `Stack<E>` (da `java.util`)

* ✅ **Mais tradicional** e diretamente chamada "pilha".
* 🔁 Baseada em **Vector** (síncrona, mas antiga).
* 📚 Métodos principais:

    * `push(E item)` – adiciona elemento ao topo
    * `pop()` – remove e retorna o topo
    * `peek()` – retorna o topo sem remover
    * `empty()` – verifica se está vazia

```java
Stack<Integer> pilha = new Stack<>();
pilha.push(10);
int topo = pilha.pop();
```

* ⚠️ **Desvantagem**: É considerada legada em novos projetos.

---

### 📌 2. `Deque<E>` (com `ArrayDeque` ou `LinkedList`)

* ✅ Recomendada para **novos projetos**.
* Implementa a interface `Deque`, permitindo uso como pilha (LIFO) ou fila (FIFO).
* Muito mais **eficiente** que `Stack`.

```java
Deque<String> pilha = new ArrayDeque<>();
pilha.push("A");
String topo = pilha.pop();
```

* 💡 `ArrayDeque` é mais rápida que `LinkedList` na maioria dos casos.

---

### 📌 3. `LinkedList<E>` (como pilha)

* Embora geralmente usada como lista ou fila, também implementa `Deque` e pode ser usada como pilha.

```java
Deque<Double> pilha = new LinkedList<>();
pilha.push(2.5);
double topo = pilha.pop();
```

* ⚠️ Levemente mais lenta que `ArrayDeque`, mas útil se já estiver usando `LinkedList`.

---

### ✅ **Resumo: Qual usar?**

| Tipo         | Recomendado para | Desempenho | Situação ideal                   |
| ------------ | ---------------- | ---------- | -------------------------------- |
| `Stack`      | Código legado    | Médio      | Manter compatibilidade           |
| `ArrayDeque` | Novos projetos   | Alto       | Pilhas puras, parsing, backtrack |
| `LinkedList` | Uso geral        | Médio      | Quando já usa listas             |

---

Se quiser, posso te mostrar **uma comparação prática entre Stack e ArrayDeque com tempo de execução**, ou um exemplo completo de uso com chamadas recursivas. Deseja isso?

Aqui estão os **principais métodos da pilha em Java**, considerando tanto a classe `Stack<E>` quanto a interface `Deque<E>` (como com `ArrayDeque` ou `LinkedList`), que é **a abordagem mais moderna**.

---

## 🧱 `Stack<E>` (classe antiga - `java.util.Stack`)

```java
Stack<Integer> stack = new Stack<>();
```

| Método             | Descrição                                                  |
| ------------------ | ---------------------------------------------------------- |
| `push(E item)`     | Adiciona um item ao topo da pilha                          |
| `pop()`            | Remove e retorna o item do topo                            |
| `peek()`           | Retorna o item do topo **sem remover**                     |
| `empty()`          | Retorna `true` se a pilha estiver vazia                    |
| `search(Object o)` | Retorna a posição (1-based) de um item, ou -1 se não achar |

### Exemplo:

```java
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
System.out.println(stack.peek()); // 20
System.out.println(stack.pop());  // 20
System.out.println(stack.empty()); // false
```

---

## 🚀 `Deque<E>` com `ArrayDeque` (recomendado)

```java
Deque<String> stack = new ArrayDeque<>();
```

| Método equivalente | Descrição                               |
| ------------------ | --------------------------------------- |
| `push(E item)`     | Adiciona um item ao topo da pilha       |
| `pop()`            | Remove e retorna o item do topo         |
| `peek()`           | Retorna o item do topo **sem remover**  |
| `isEmpty()`        | Retorna `true` se a pilha estiver vazia |

> 📝 *Esses métodos são parte da interface `Deque`, mas quando usados com `ArrayDeque`, se comportam como uma pilha.*

### Exemplo:

```java
Deque<String> stack = new ArrayDeque<>();
stack.push("A");
stack.push("B");
System.out.println(stack.peek()); // B
System.out.println(stack.pop());  // B
System.out.println(stack.isEmpty()); // false
```

---

### 🧠 Observação sobre `peekFirst`, `peekLast` etc.

A interface `Deque` tem mais métodos:

* `peekFirst()` / `peekLast()`
* `pollFirst()` / `pollLast()`
* `offerFirst()` / `offerLast()`

Mas para uso como **pilha**, você só precisa usar:
👉 `push`, `pop`, `peek`, `isEmpty`.

---

Se quiser, posso montar uma **tabela comparativa de Stack vs Deque**, ou um **exemplo real de uso de pilha para validar expressões matemáticas**. Deseja isso?

Boa! Vamos além do básico.

Aqui estão **outros métodos úteis** disponíveis quando se usa `Stack<E>` e `Deque<E>` em Java, incluindo métodos herdados das superclasses/interfaces (`Vector` e `Collection`). Embora nem todos façam sentido em um uso de "pilha pura", eles podem ser úteis dependendo do seu cenário.

---

## 🧱 Métodos adicionais de `Stack<E>`

A classe `Stack` herda de `Vector`, então além dos métodos de pilha clássicos (`push`, `pop`, `peek`, `empty`, `search`), você também tem acesso a:

| Método                | Descrição                                     |
| --------------------- | --------------------------------------------- |
| `size()`              | Retorna o número de elementos na pilha        |
| `get(int index)`      | Retorna o elemento no índice especificado     |
| `set(int index, E e)` | Substitui o elemento no índice especificado   |
| `clear()`             | Remove todos os elementos                     |
| `contains(Object o)`  | Verifica se o item está na pilha              |
| `remove(Object o)`    | Remove a primeira ocorrência do item          |
| `iterator()`          | Retorna um `Iterator` para percorrer os itens |

### Exemplo:

```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.contains("A")); // true
System.out.println(stack.get(0)); // A
stack.clear(); // limpa tudo
```

---

## 🚀 Métodos adicionais de `Deque<E>` (usado com `ArrayDeque`, `LinkedList`)

A interface `Deque` fornece muitos métodos que funcionam tanto como pilha quanto como fila.

### 🧩 Métodos úteis mesmo usando como pilha:

| Método            | Descrição                                                     |
| ----------------- | ------------------------------------------------------------- |
| `removeFirst()`   | Remove o primeiro elemento (igual `pop()` em uso de pilha)    |
| `removeLast()`    | Remove o último elemento                                      |
| `offerFirst(E e)` | Adiciona no início (igual `push`) e retorna `true` se sucesso |
| `offerLast(E e)`  | Adiciona no final (fila)                                      |
| `pollFirst()`     | Remove e retorna o primeiro, ou `null` se vazio               |
| `pollLast()`      | Remove e retorna o último, ou `null` se vazio                 |
| `peekFirst()`     | Consulta o primeiro elemento, sem remover                     |
| `peekLast()`      | Consulta o último elemento, sem remover                       |

### 🧪 Exemplo:

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.offerFirst(10);  // igual push
stack.offerFirst(20);
System.out.println(stack.peekFirst()); // 20
System.out.println(stack.pollFirst()); // 20
```

---

### 💡 Resumo rápido

| Método       | `Stack` | `Deque` (`ArrayDeque`) | Descrição                |
| ------------ | ------- | ---------------------- | ------------------------ |
| `push`       | ✅       | ✅                      | Adiciona no topo         |
| `pop`        | ✅       | ✅                      | Remove do topo           |
| `peek`       | ✅       | ✅                      | Consulta o topo          |
| `empty`      | ✅       | ❌ (usa `isEmpty`)      | Verifica se está vazia   |
| `search`     | ✅       | ❌                      | Busca por item (1-based) |
| `offerFirst` | ❌       | ✅                      | Adiciona no início       |
| `peekFirst`  | ❌       | ✅                      | Consulta o primeiro      |

---

Se quiser, posso te mostrar:

* Um exemplo prático de pilha para **verificar parênteses balanceados**
* Um mini projeto de **desfazer/refazer (undo/redo)** usando pilha
  Quer seguir com algum desses?
