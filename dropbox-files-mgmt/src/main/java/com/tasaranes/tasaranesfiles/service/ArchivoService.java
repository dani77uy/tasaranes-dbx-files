package com.tasaranes.tasaranesfiles.service;

import com.dropbox.core.DbxException;
import com.dropbox.core.v1.DbxClientV1;
import com.dropbox.core.v1.DbxEntry;
import com.tasaranes.tasaranesfiles.domain.Archivo;
import com.tasaranes.tasaranesfiles.domain.TasaranesException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by T_DanielB6 on 18/04/2016.
 */
public class ArchivoService {

   private static final Logger LOG = LogManager.getLogger(ArchivoService.class);

   private final DbxClientV1 client;

   public ArchivoService(DbxClientV1 client) {
      this.client = client;
   }

   public List<DbxEntry> getFiles(String path) throws TasaranesException {
      try {
         final DbxEntry.WithChildren listing = client.getMetadataWithChildren(path);
         if (listing != null) {
            return listing.children;
         }
      } catch (DbxException ex) {
         LOG.error("Error al ingresar a dropbox", ex);
         throw new TasaranesException("Error al ingresar a dropbox");
      }
      return null;
   }

   public boolean equals(String path1, String path2) {

   }
}
