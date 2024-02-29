public class P33HashTable{
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public P33HashTable(){
        this(10);
    }

    public P33HashTable(int capacity){
        this.numOfBuckets =  capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(int key, String val){
        int bucketsIndex = getBucketIndex(key);
        HashNode head = buckets[bucketsIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = val;

            }head = head.next;
        }size++;
        head = buckets[bucketsIndex];
        HashNode node = new HashNode(key, val);
        node.next = head;
        buckets[bucketsIndex] = node;

    }

    public String get(int key){
        int bucketsIndex = getBucketIndex(key);
        HashNode head = buckets[bucketsIndex];
        while (head !=  null){
            if(head.key.equals(key)){
                return head.value;
            }head = head.next;
            

        }
        return null;


    }

    public String remove(int key){
        int bucketsIndex = getBucketIndex(key);
        HashNode head = buckets[bucketsIndex];
        HashNode prev = null;
        while(head != null){
            if(head.key.equals(key)){
                break;
            }prev = head;
            head = head.next;
        }size--;
        if(head == null){
            return null;
        }
        if(prev !=  null){
            prev.next = head.next;
        }else{
            buckets[bucketsIndex] = head.next;

        }return head.value;

    }

    public int getBucketIndex(int key){
        return key % numOfBuckets;
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        P33HashTable table = new P33HashTable(10);
        table.put(105, "John");
        table.put(12, "Tom");
        table.put(101, "Emily");
        System.out.print("Putting value to HashTable and size after being put: ");
        System.out.print(table.get(105));
        System.out.print(", " + table.get(12));
        System.out.print(", " + table.get(101));
        System.out.println(" |size:" + table.getSize());

        System.out.print("Getting value from HashTable: ");
        System.out.println(table.get(105));

        System.out.print("Removing value from HashTable and size after being removed: ");
        System.out.print(table.remove(12));
        System.out.println(" |size:" + table.getSize());
        
    }
}