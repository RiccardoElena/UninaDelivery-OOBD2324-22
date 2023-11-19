# Organizzazione del progetto

## Strumenti utilizzati

- Github ([repository](https://www.youtube.com/watch?v=p7YXXieghto))
- Visual Studio Code
- Discord
- Latex
- Postgresql (localhost)

## Struttura del progetto

Da definire in seguito ad assegnazione traccia

## Struttura del repository

- `README.md`: README generale del progetto, questo file.
- `oo/`: cartella relativa al progetto di Object Orientation.
  - `oo/docs`: documentazione del progetto di Object Orientation.
    - `Documentazione-ObjectOrientation-GroupID.pdf`: documentazione del progetto di Object Orientation.
  - `oo/src/`: codice sorgente del progetto di Object Orientation.
  - `oo/pom.xml`: file di configurazione Maven.
- `db/`: cartella relativa al progetto di Basi di Dati.
  - `db/docs`: documentazione del progetto di Basi di Dati.
    - `Documentazione-BasiDiDati-GroupID.pdf`: documentazione del progetto di Basi di Dati.
  - `db/src/`: codice sorgente del progetto di Basi di Dati.
    - `README.md`: README del progetto di Basi di Dati.

## Gestione repository GitHub

### Gestione branches

- `main`: branch principale
- `develop`: branch di sviluppo
- `feature-NOMEFEATURE/`: branch facvoltativa per feature extra

#### Workflow

Struttura generale di ereditarietà

`feature-* -> develop -> main` (tramite pull request e code review per main).

- _Gitflow_ `feature-* -> develop`: ogni membro del gruppo può creare un branch per sviluppare una feature extra, che verrà poi integrata nel branch `develop` tramite pull request e code review.

- _Parallel Branches_ `develop -> main`: il branch `develop` sarà parallelo al branch `main` in cui verrà integrato periodicamente tramite pull request e code review.

### Standard dei Commit Messages

Si utilizza lo standard fornito da [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) eventualmente adattato per il progetto.

### Gestione issues

Di persona o tramite Discord.

### Gestione pull requests

Approvazione di tutti i collaboratori del progetto necessaria all'approvazione.

## Distribuzione dei ruoli

### Progettazione

Per quanto riguarda l'intera fase di progettazione sia di Basi di Dati che di Object Orientation, verrà svolta in maniera collaborativa da tutti i membri del gruppo.

### Implementazione

Suddivisione equa delle feature da implementare tra tutti i membri del gruppo **_successiva alla fase di progettazione_**.

### Documentazione

Ogni membro si farà carico di aggiornare la documentazione relativa alla parte di progetto di cui si è occupato o della feature che ha implementato.

### Testing

Ogni membro si farà carico di testare in autonomia **TUTTO** il progetto nello stato corrente e di riportare agli altri collaboratori eventuali _warnings_, **errors**, o **_BUG_** trovati.
