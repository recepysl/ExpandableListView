package com.umut.expandablelistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Şehirler");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        expListView = (ExpandableListView) findViewById(R.id.ExpandableListView);
        Data();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });


    }

    private void Data() {

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Header
        listDataHeader.add("Akdeniz Bölgesi");
        listDataHeader.add("Ege Bölgesi");
        listDataHeader.add("Marmara Bölgesi");
        listDataHeader.add("Karadeniz Bölgesi");
        listDataHeader.add("İç Anadolu Bölgesi");
        listDataHeader.add("Doğu Anadolu Bölgesi");
        listDataHeader.add("Güney Doğu Anadolu Bölgesi");


        // akdeniz
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ADANA");
        arrayList1.add("ANTALYA");
        arrayList1.add("BURDUR");
        arrayList1.add("HATAY");
        arrayList1.add("ISPARTA");
        arrayList1.add("KAHRAMAN MARAŞ");
        arrayList1.add("MERSİN");
        arrayList1.add("OSMANİYE");

        //ege
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("AFYONKARAHİSAR");
        arrayList2.add("AYDIN");
        arrayList2.add("DENİZLİ");
        arrayList2.add("İZMİR");
        arrayList2.add("KÜTAHYA");
        arrayList2.add("MANİSA");
        arrayList2.add("MUĞLA");
        arrayList2.add("UŞAK");

        // marmara
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("BALIKESİR");
        arrayList3.add("BİLECİK");
        arrayList3.add("BURSA");
        arrayList3.add("ÇANAKKALE");
        arrayList3.add("EDİRNE");
        arrayList3.add("İSTANBUL");
        arrayList3.add("KOCAELİ");
        arrayList3.add("SAKARYA");
        arrayList3.add("TEKİRDAĞ");
        arrayList3.add("YALOVA");

        // karadeniz
        List<String> arrayList4 = new ArrayList<>();
        arrayList4.add("ARTVİN");
        arrayList4.add("BARTIN");
        arrayList4.add("BOLU");
        arrayList4.add("ÇORUM");
        arrayList4.add("DÜZCE");
        arrayList4.add("GİRESUN");
        arrayList4.add("GÜMÜŞHANE");
        arrayList4.add("KARABÜK");
        arrayList4.add("KASTAMONU");
        arrayList4.add("ORDU");
        arrayList4.add("RİZE");
        arrayList4.add("SAMSUN");
        arrayList4.add("SİNOP");
        arrayList4.add("TOKAT");
        arrayList4.add("TRABZON");
        arrayList4.add("ZONGULDAK");

        // iç anadolu
        List<String> arrayList5 = new ArrayList<>();
        arrayList5.add("ANKARA");
        arrayList5.add("AKSARAY");
        arrayList5.add("ÇANKIRI");
        arrayList5.add("ESKİŞEHİR");
        arrayList5.add("KARAMAN");
        arrayList5.add("KAYSERİ");
        arrayList5.add("KIRIKKALE");
        arrayList5.add("KIRŞEHİR");
        arrayList5.add("KONYA");
        arrayList5.add("NEVŞEHİR");
        arrayList5.add("NİĞDE");
        arrayList5.add("SİVAS");
        arrayList5.add("YOZGAT");

        // doğu anadolu
        List<String> arrayList6 = new ArrayList<>();
        arrayList6.add("ARDAHAN");
        arrayList6.add("AĞRI");
        arrayList6.add("BİNGÖL");
        arrayList6.add("BİTLİS");
        arrayList6.add("ELAZIĞ");
        arrayList6.add("ERZİNCAN");
        arrayList6.add("ERZURUM");
        arrayList6.add("HAKKARİ");
        arrayList6.add("IĞDIR");
        arrayList6.add("KARS");
        arrayList6.add("MALATYA");
        arrayList6.add("MUŞ");
        arrayList6.add("TUNCELİ");
        arrayList6.add("VAN");

        // güney doğu anadolu
        List<String> arrayList7 = new ArrayList<>();
        arrayList7.add("ADIYAMAN");
        arrayList7.add("BATMAN");
        arrayList7.add("DİYARBAKIR");
        arrayList7.add("GAZİ ANTEP ");
        arrayList7.add("KİLİS");
        arrayList7.add("MARDİN");
        arrayList7.add("SİİRT");
        arrayList7.add("ŞANLI URFA");
        arrayList7.add("ŞIRNAK ");

        listDataChild.put(listDataHeader.get(0), arrayList1);
        listDataChild.put(listDataHeader.get(1), arrayList2);
        listDataChild.put(listDataHeader.get(2), arrayList3);
        listDataChild.put(listDataHeader.get(3), arrayList4);
        listDataChild.put(listDataHeader.get(4), arrayList5);
        listDataChild.put(listDataHeader.get(5), arrayList6);
        listDataChild.put(listDataHeader.get(6), arrayList7);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
