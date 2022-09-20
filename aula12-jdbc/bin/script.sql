CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar (50), telefone varchar(11),
email varchar(40) unique);

INSERT INTO cliente (nome,telefone,email),
			VALUES('Adriano','232231222','a@gmail.com'),
				  ('Adrianoa','232231232','ad@gmail.com'),
				  ('Fernanda','234431222','f@gmail.com');
					