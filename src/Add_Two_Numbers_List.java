class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode criarLista(int [] valores) {
        if (valores.length == 0) return null;

        ListNode head = new ListNode(valores[0]);
        ListNode atual = head;

        for (int i = 1; i < valores.length; i++) {
            atual.next = new ListNode(valores[i]);
            atual = atual.next;
        }

        return head;
    }
    public static String toListastring(ListNode cabeca_lista) {
        StringBuilder lista = new StringBuilder();
        lista.append("[");
        while (cabeca_lista != null){
            lista.append(cabeca_lista.val);
            if(cabeca_lista.next != null){
                lista.append(",");
            }
            cabeca_lista = cabeca_lista.next;
        }
        lista.append("]");

        return lista.toString();
    }
}

public class Add_Two_Numbers_List {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode cabeca_da_lista = new ListNode(); // cabeça fixa
        ListNode lista_soma = cabeca_da_lista;
        int vai_um = 0;
        while (l1 != null || l2 != null){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;

            int s = n1 + n2 + vai_um;

            vai_um = s / 10;
            lista_soma.next = new ListNode(s % 10);
            lista_soma = lista_soma.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        if(vai_um != 0){
            lista_soma.next = new ListNode(vai_um);
        }

        return cabeca_da_lista.next;
    }

    public static void main(String[] args) {
        Add_Two_Numbers_List atn = new Add_Two_Numbers_List();
        ListNode l1 = ListNode.criarLista(new int[]{2,4,3});
        ListNode l2 = ListNode.criarLista(new int[]{5,6,4});

        ListNode resultado = atn.addTwoNumbers(l1, l2);

        System.out.println(ListNode.toListastring((resultado)));

    }
}
