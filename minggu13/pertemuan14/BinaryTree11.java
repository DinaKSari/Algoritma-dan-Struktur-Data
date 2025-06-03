package pertemuan14;

public class BinaryTree11 {
    Node11 root;

    public BinaryTree11() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa11 mhs){
        Node11 newNode = new Node11(mhs);
        if(isEmpty()){
            root = newNode;
        } else{
            Node11 current = root;
            Node11 parent = null;
            while (true) { 
                parent = current;
                if(mhs.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                } else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find (double ipk) {
        boolean result = false;
        Node11 current = root;
            while (current != null) {
                if (current.mahasiswa.ipk == ipk) {
                    result = true;
                    break;
                }else if(ipk > current.mahasiswa.ipk) {
                    current = current.right;
                }else{
                    current = current.left;
                }
            }
        return result;
    }

    void traversePreOrder (Node11 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder (node.left);
            traversePreOrder (node.right);
        }
    }

    void traverseInOrder (Node11 node) {
        if (node != null) {
            traverseInOrder (node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder (node.right);
        }
    }

    void traversePostOrder (Node11 node) {
        if (node != null) {
            traversePostOrder (node.left);
            traversePostOrder (node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node11 getSuccessor (Node11 del) {
        Node11 successor = del.right;
        Node11 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
            }
            if (successor != del.right) {
                successorParent.left = successor.right;
                successor.right = del.right;
            }
            return successor;
    }

    void delete (double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left == null) {//jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                    parent.left = current.right;
                    }else{
                    parent.right = current.right;
                    }
                }
            }else if (current.right == null) {//jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            } else{//jika punya 2 anak
                Node11 successor = getSuccessor (current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                successor.left = current.left;
                }
            }
        }
    }

    //tugas praktikum modifikasi

    //rekursif method untuk penambahan data baru
    public void addRekursif(Mahasiswa11 mhs) {
        root = addRekursifHelper(root, mhs);
    }

    public Node11 addRekursifHelper(Node11 current, Mahasiswa11 mhs) {
        if (current == null) {
            return new Node11(mhs);
        }

        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mhs);
        } else {
            current.right = addRekursifHelper(current.right, mhs);
        }
        return current;
    }

    //search
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node11 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node11 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }
    //show yang di perlukan
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtasHelper(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtasHelper(Node11 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasHelper(node.right, ipkBatas);
        }
    }


}
