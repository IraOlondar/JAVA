package seminar6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Depository {
    private List<Notebook> notebookList;

    public Depository(List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    public Depository() {
        this(new ArrayList<>());
    }

    public List<Notebook> getNotebookList() {
        return notebookList;
    }

    public void addNotebook(Notebook notebook){
        notebookList.add(notebook);
    }

    public int getNextId(){
        return getNotebookList().size() + 1;
    }

    public List<Notebook> getProductByOs(String os){
        List<Notebook> res = new ArrayList<>();
        for (Notebook notebook: notebookList){
            if (os.toLowerCase().equals(notebook.getOs().toLowerCase())){
                res.add(notebook);
            }
        }
        return res;
    }

    public List<Notebook> getProductByBrand(String brand){
        List<Notebook> res = new ArrayList<>();
        for (Notebook notebook: notebookList){
            if (brand.toLowerCase().equals(notebook.getBrand().toLowerCase())){
                res.add(notebook);
            }
        }
        return res;
    }

    public List<Notebook> getProductByRam(String ram){
        List<Notebook> res = new ArrayList<>();
        for (Notebook notebook: notebookList){
            if (Integer.parseInt(ram) == notebook.getRam()){
                res.add(notebook);
            }
        }
        return res;
    }

    public List<Notebook> getProductByHdd(String hdd){
        List<Notebook> res = new ArrayList<>();
        for (Notebook notebook: notebookList){
            if (Integer.parseInt(hdd) == notebook.getRam()){
                res.add(notebook);
            }
        }
        return res;
    }

    public List<Integer> getFieldListValueRam(){
        HashSet<Integer> res = new HashSet<>();
        for (Notebook notebook: notebookList){
            res.add(notebook.getRam());
        }

        List<Integer> resOut = new ArrayList<>(res);
        Collections.sort(resOut);

        return resOut;
    }

    public List<Integer> getFieldListValueHdd(){
        HashSet<Integer> res = new HashSet<>();
        for (Notebook notebook: notebookList){
            res.add(notebook.getHdd());
        }

        List<Integer> resOut = new ArrayList<>(res);
        Collections.sort(resOut);

        return resOut;
    }

    public List<String> getFieldListValueOs(){
        HashSet<String> res = new HashSet<>();
        for (Notebook notebook: notebookList){
            res.add(notebook.getOs());
        }

        List<String> resOut = new ArrayList<>(res);
        Collections.sort(resOut);

        return resOut;
    }

    public List<String> getFieldListValueBrand(){
        HashSet<String> res = new HashSet<>();
        for (Notebook notebook: notebookList){
            res.add(notebook.getBrand());
        }

        List<String> resOut = new ArrayList<>(res);
        Collections.sort(resOut);

        return resOut;
    }
}
