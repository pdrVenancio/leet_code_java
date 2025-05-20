
class ListNodeString {
    int val;
    ListNodeString next;
    ListNodeString() {}
    ListNodeString(int val) { this.val = val; }
    ListNodeString(int val, ListNodeString next) { this.val = val; this.next = next; }
    public static ListNodeString criarLista(int [] valores) {
        if (valores.length == 0) return null;

        ListNodeString head = new ListNodeString(valores[0]);
        ListNodeString atual = head;

        for (int i = 1; i < valores.length; i++) {
            atual.next = new ListNodeString(valores[i]);
            atual = atual.next;
        }

        return head;
    }
}

public class Add_Two_Numbers_String{
    public String addTwoNumbersString(ListNodeString l1, ListNodeString l2){
        // Por l1 e l2 serem uma lista encadeada nao da para usar .length
        StringBuilder num1 = new StringBuilder();
        while (l1 != null){
            num1.append(l1.val);
            l1 = l1.next;
        }

        StringBuilder num2 = new StringBuilder();
        while (l2 != null){
            num2.append(l2.val);
            l2 = l2.next;
        }

        // Inverto as strings
        num1.reverse();
        num2.reverse();

        int valor1 = Integer.parseInt(num1.toString());
        int valor2 = Integer.parseInt(num2.toString());

        int soma = valor1 + valor2;

        return Integer.toString(soma);
    }

    public static void main(String[] args) {
        Add_Two_Numbers_String atn = new Add_Two_Numbers_String();
        ListNodeString l1 = ListNodeString.criarLista(new int[]{9,9,9,9,9,9,9});
        ListNodeString l2 = ListNodeString.criarLista(new int[]{9,9,9,9});

        String resultado = atn.addTwoNumbersString(l1, l2);
        System.out.println(resultado);
    }
}
