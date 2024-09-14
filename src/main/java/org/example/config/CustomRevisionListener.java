package org.example.config;

import org.hibernate.envers.RevisionListener;
import org.example.audit.Revision;

    public class CustomRevisionListener implements RevisionListener{

        public void newRevision(Object revisionEntity){
            final Revision revision = (Revision) revisionEntity;
        }
    }
