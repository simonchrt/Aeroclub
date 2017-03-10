--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.1
-- Dumped by pg_dump version 9.5.1

-- Started on 2016-05-22 20:50:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12355)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2123 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 183 (class 1259 OID 16623)
-- Name: comptes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE comptes (
    num integer NOT NULL,
    solde double precision
);


ALTER TABLE comptes OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 16511)
-- Name: membres; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE membres (
    num_membre integer NOT NULL,
    court text,
    num_qualif integer,
    num integer,
    nom text,
    prenom text,
    adresse text,
    code_postal text,
    ville text,
    tel text,
    email text,
    num_badge integer,
    profession text,
    date_naissance text,
    lieu_naissance text,
    date_entree text
);


ALTER TABLE membres OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 16609)
-- Name: qualif; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE qualif (
    num_qualif integer NOT NULL,
    libelle text
);


ALTER TABLE qualif OWNER TO postgres;

--
-- TOC entry 2115 (class 0 OID 16623)
-- Dependencies: 183
-- Data for Name: comptes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO comptes (num, solde) VALUES (2, 10);
INSERT INTO comptes (num, solde) VALUES (3, 50);
INSERT INTO comptes (num, solde) VALUES (1, 40.100000000000001);
INSERT INTO comptes (num, solde) VALUES (4, 50.100000000000001);
INSERT INTO comptes (num, solde) VALUES (5, 50.25);


--
-- TOC entry 2113 (class 0 OID 16511)
-- Dependencies: 181
-- Data for Name: membres; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO membres (num_membre, court, num_qualif, num, nom, prenom, adresse, code_postal, ville, tel, email, num_badge, profession, date_naissance, lieu_naissance, date_entree) VALUES (1, 'Mr', 1, 5, 'Leeroy', 'Jenkins', '1 rue des peupliers', '06000', 'Nice', '0324000000', 'leeroyj@hotmail.fr', 1, 'Ingénieur', '10/10/1990', 'Montpellier', '10/05/2016');


--
-- TOC entry 2114 (class 0 OID 16609)
-- Dependencies: 182
-- Data for Name: qualif; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO qualif (num_qualif, libelle) VALUES (3, 'Bac Pro');
INSERT INTO qualif (num_qualif, libelle) VALUES (2, 'BTS');
INSERT INTO qualif (num_qualif, libelle) VALUES (1, 'Doctorat');


--
-- TOC entry 1996 (class 2606 OID 16627)
-- Name: comptes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY comptes
    ADD CONSTRAINT comptes_pkey PRIMARY KEY (num);


--
-- TOC entry 1992 (class 2606 OID 16515)
-- Name: membres_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY membres
    ADD CONSTRAINT membres_pkey PRIMARY KEY (num_membre);


--
-- TOC entry 1994 (class 2606 OID 16616)
-- Name: num_qualification; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY qualif
    ADD CONSTRAINT num_qualification PRIMARY KEY (num_qualif);


--
-- TOC entry 1989 (class 1259 OID 16622)
-- Name: fki_num_qualif; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_num_qualif ON membres USING btree (num_qualif);


--
-- TOC entry 1990 (class 1259 OID 16633)
-- Name: fki_numcompte; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_numcompte ON membres USING btree (num);


--
-- TOC entry 1997 (class 2606 OID 16617)
-- Name: num_qualif; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY membres
    ADD CONSTRAINT num_qualif FOREIGN KEY (num_qualif) REFERENCES qualif(num_qualif);


--
-- TOC entry 1998 (class 2606 OID 16628)
-- Name: numcompte; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY membres
    ADD CONSTRAINT numcompte FOREIGN KEY (num) REFERENCES comptes(num);


--
-- TOC entry 2122 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2016-05-22 20:50:38

--
-- PostgreSQL database dump complete
--

