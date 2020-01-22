public class HashMap<K,V> implements Map<K,V> {
Entry<K,V> [] hashMap;
int size;
public static void main(String[] args) {
  
}
public HashMap(int buckets){
        hashMap = new Entry[buckets];
        size=0;
}
public HashMap(){
        hashMap = new Entry[64];
        size=0;
}
// This method removes all mappings from the Map.
// Should be more efficient that calling remove() on every element.
public void clear(){
        for(int i=0; i<hashMap.length; i++) {
                hashMap[i]=null;
                size =0;
        }
}
// This method returns true if the Map contains a mapping for the specified key,
// and false otherwise.
public boolean containsKey(K key){
        int hash = hash(key);
        if(hashMap[hash]==null) {return false;}
        else{
                Entry currentEntry = hashMap[hash];
                while(currentEntry!=null&& currentEntry.getKey()!=key) {
                        if(currentEntry.getKey().equals(key)) {
                                return true;
                        }
                        currentEntry= currentEntry.getNext();

                }
                if(currentEntry!=null) {

                        return true;
                }
                return true;

        }


}
// This method returns true if the Map contains a mapping for the specified value,
// and false otherwise.
public boolean containsValue(V value){
        boolean containVal = false;
        for(int i=0; i<hashMap.length; i++) {
                if(hashMap[i]==null) {containVal=false;}
                else if(hashMap[i].getValue().equals(value)) {
                        return true;
                }

        }
        return containVal;
}
// This method returns the value to which the specified key is mapped.
// If the Map does not contain the specified key, the method instead returns null.
public V get(K key){

        int x =hash(key);
        if(hashMap[x]==null) {return null;}
        else if(hashMap[x].getKey().equals(key)) {
                return hashMap[x].getValue();
        }
        else{
                return null;
        }

}
// This method returns true if the Map contains no key-value mappings,
//and false otherwise.
public boolean isEmpty(){
        boolean isEmpty=true;
        for(int i=0; i<hashMap.length; i++) {
                if(hashMap[i]==null) {isEmpty=true;}
                else if(hashMap[i].getKey()!=null) {return false;}

        }

        return isEmpty;
}
// This method associates the specified key with the specified value in the Map
// and returns the newly associated value,
// if the specified key is not already associated with a non-null value.
// If the specified key is already associated with a non-null value,
// the association is left unchanged, and the current value is returned instead.
/*
   This method associates the specified key with the specified value in the Map and returns
   the newly associated value, if the specified key is not already in the HashMap. If the
   specified key is already in the HashMap, the association is left unchanged, and the
   current value is returned instead.
 */
public V put(K key, V value){
        int x = hash(key);
        if(!containsKey(key)) {
                hashMap[x]= new Entry(key,value,null);
                size+=1;
                return value;

        }
        else if(containsKey(key)) {
                Entry current = hashMap[x];
                while(current.getNext()!=null) {

                        current=current.getNext();

                }
                current.setNext(new Entry(key,value,null));

                size+=1;
        }
        return hashMap[x].getValue();

}
// This method removes and returns the mapping for the specified key in the Map
// if it is present, and returns null otherwise.
public V remove(K key){

        int x = hash(key);
        if(containsKey(key)) {
                V temp = hashMap[x].getValue();
                hashMap[x]=null;
                size-=1;
                return temp;
        }
        else{return null;}
}
// This method replaces and returns the mapping for the specified key only
// if it is currently mapped to to some value, and returns null otherwise.
/*
   If the specified key is already mapped to a value, this method will return the
   previous value associated with the key and replace it will the input value. If the specified
   key is not mapped to a value, this method will simply return null, altering nothing in the HashMap.
 */
public V replace(K key, V value){
        int x = hash(key);
        if(containsKey(key)) {
                V temp = hashMap[x].getValue();
                hashMap[x]= new Entry(key,value);
                return temp;
        }
        else{
                return null;
        }

}

private int hash(K key){
        String value = (String) key;
        char characterArray[];
        characterArray=value.toCharArray();
        int hash =0;
        for(int i=0; i<value.length(); i++) {
                // Used general idea of using primes from: https://computinglife.wordpress.com/2008/11/20/why-do-hash-functions-use-prime-numbers/
                hash+=31*characterArray[i];

        }

        return hash%hashMap.length;

}
public void display(){
        String result="";
        if(isEmpty()==true) {
                System.out.println("{}");
        }
        else{result = "{";
             for(int i=0; i<hashMap.length; i++) {



                     if(hashMap[i]!=null &&hashMap[i].getKey()!=null && hashMap[i].getValue()!=null) {

                             K key = hashMap[i].getKey();
                             V value = hashMap[i].getValue();
                             Entry nextVal = hashMap[i].getNext();

                             while(nextVal!=null) {
                                     result+=nextVal.getKey()+":"+nextVal.getValue()+",";
                                     nextVal= nextVal.getNext();
                             }



                             result+= key+":"+value+",";
                     }
             }
             result= result.replaceAll(",$","");
             result+="}";}

        System.out.println(result);
}


public int size(){
        return size;
}

}
