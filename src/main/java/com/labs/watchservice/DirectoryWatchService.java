package com.labs.watchservice;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class DirectoryWatchService {

	public static void main(String args[]) throws IOException {

		try{
			WatchService watchService = FileSystems.getDefault().newWatchService();

			Path directory = Paths.get("/Users/muralipadavala/dev/fileimport");

			directory.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

			System.out.println("Watch Service registered for dir: " + directory.getFileName());

			while (true) {
				WatchKey key;
				try {
					key = watchService.take();
				} catch (InterruptedException ex) {
					return;
				}
				
				for (WatchEvent<?> event : key.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();

					@SuppressWarnings("unchecked")
					WatchEvent<Path> ev = (WatchEvent<Path>) event;
					Path fileName = ev.context();

					System.out.println(kind.name() + ": " + fileName);

					if (kind == ENTRY_MODIFY && fileName.toString().equals("Directory is modified")) {
						System.out.println(fileName + " - has changed!!!");
					}
				}

				boolean valid = key.reset();
				if (!valid) {
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
