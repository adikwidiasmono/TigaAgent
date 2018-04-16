package com.tiga.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by adikwidiasmono on 20/11/17.
 */

public class FirebaseDB {
    //    public static final String  = "";
    public static final String REF_INVOICES = "STOK_REQUEST";

    private static FirebaseDB firebaseDB;
    private FirebaseDatabase fDB;

    public static FirebaseDB init() {
        if (firebaseDB == null) {
            firebaseDB = new FirebaseDB();
            firebaseDB.fDB = FirebaseDatabase.getInstance();
        }

        return firebaseDB;
    }

    public DatabaseReference getDBReference() {
        return fDB.getReference();
    }

    public DatabaseReference getDBReference(String refName) {
        return fDB.getReference(refName);
    }

//    public void addAllergy(Allergy allergy) {
//        DatabaseReference fRef = fDB.getReference(REF_ALLERGYS);
//
//        String allergyId = fRef.push().getKey();
//        allergy.setAllergyId(allergyId);
//        fRef.child(allergyId).setValue(allergy);
//    }
//
//    public void addTimeline(TimelineContent content) {
//        DatabaseReference fRef = fDB.getReference(REF_TIMELINE_MED_RECS);
//
//        String timelineId = fRef.push().getKey();
//        content.setTimelineId(timelineId);
//        fRef.child(timelineId).setValue(content);
//    }
//
//    public void addHistories(History history) {
//        DatabaseReference fRef = fDB.getReference(REF_HISTORIES);
//
//        String historyId = fRef.push().getKey();
//        history.setHistoryId(historyId);
//        fRef.child(historyId).setValue(history);
//    }
//
//    public void addInsuranceProducts(InsuranceProduct product) {
//        DatabaseReference fRef = fDB.getReference(REF_INSURANCE_PRODUCT);
//
//        String insuranceProductId = fRef.push().getKey();
//        product.setInsuranceProductId(insuranceProductId);
//        fRef.child(insuranceProductId).setValue(product);
//    }
//
//    public void updateNotif() {
//        DatabaseReference fRef = fDB.getReference(REF_NOTIFICATIONS);
//
//        String notifId = "NOTIF_ID";
//        fRef.child(notifId).setValue("Notif : " + System.currentTimeMillis());
//    }

}
